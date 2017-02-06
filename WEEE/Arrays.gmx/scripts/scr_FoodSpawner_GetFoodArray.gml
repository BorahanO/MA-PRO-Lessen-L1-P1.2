/// scr_FoodSpawner_GetFoodArray(foodName)

/*
    Controleert of het eerste argument (argument0 OF argument[0])
    een stuk tekst is.
    
    Dit is dus een Array van argumenten:
        argument[0], argument[1], argument[2], etc
*/
if (is_string(argument[0]))
{
    // We maken een tijdelijke variabele aan.
    // Hier stoppen we al het eten in van dezelfde soort.
    var foodArray;
    foodArray = 0; // Een lege array maken.
    
    // Een for-loop waarin alle "obj_Food" objecten worden afgegaan:
    for (var i = 0; i < instance_number(obj_Food); i++)
    {
        // We halen een stuk eten op en slaan deze op in een
        // tijdelijke variabele:
        var foodObject = instance_find(obj_Food, i);
        
        // Hier voeren we de controle op de naam uit die wij
        // in deze functie, als eerste argument, binnenkrijgen.
        if (foodObject.name == argument[0])
        {
            // Vervolgens slaan we de huidige lengte van het
            // lijstje op. Dan weten we op welke plek in de lijst
            // het volgende object gezet moet worden:
            var nextArrayIndex = array_length_1d(foodArray);
            foodArray[nextArrayIndex] = foodObject;
        }
    }
    
    // We hebben nu een gevuld lijstje (Array) met hetzelfde eten.
    // De lijst is leeg als we geen objecten met het type [foodName]
    // hebben kunnen vinden. ("foodname" is argument[0])
    return foodArray;
}
else
{
    // Omdat we een argument binnen hebben gekregen dat GEEN
    // stuk tekst is, geven we terug dat er niks is gemaakt.
    return undefined;
}
