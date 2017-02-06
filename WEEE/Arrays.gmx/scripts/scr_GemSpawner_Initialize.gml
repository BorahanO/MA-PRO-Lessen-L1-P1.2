// Opdracht A en B schrijf je hier:

// Hier vullen we handmatig, stuk voor stuk, de array "foodArray":
//gemArray[0] = instance_create(0 ,  0, obj_Food);
//gemArray[1] = instance_create(32,  0, obj_Food);
//gemArray[2] = instance_create(64,  0, obj_Food);
//gemArray[3] = instance_create(96,  0, obj_Food);
//gemArray[4] = instance_create( 0, 64, obj_Food);
//gemArray[5] = instance_create(32, 64, obj_Food);

var positionXthingy = 0;
var positionYthingy = 192;

for(var i = 0; i < 20; i+=1 ){
    positionXthingy += 32;    


    gemArray[i] = instance_create(positionXthingy ,  positionYthingy, obj_Gem);
    
    
    if(i == 4) {
        positionYthingy = 192 + 32;
        positionXthingy = 0;
    } else if(i == 9) {
        positionYthingy = 192 + 64;
        positionXthingy = 0;
    } else if(i == 14) {
        positionYthingy = 192 + 96;
        positionXthingy = 0;
    }
    
    
    show_message( "Waarde van " + string(i) + ": " + string(gemArray[i].points) );
}
// Om een enkel object of stuk data in een Array aan te passen
// (Verplaats het eerste object 32 pixels naar beneden):
//gemArray[0].y += 32;


//var newArray = scr_FoodSpawner_GetFoodArray("tomaat");


// Weergeeft hoeveel objecten er in "foodArray" zitten:
show_message( string("Aantal gems: ") + string(array_length_1d(gemArray)) );

