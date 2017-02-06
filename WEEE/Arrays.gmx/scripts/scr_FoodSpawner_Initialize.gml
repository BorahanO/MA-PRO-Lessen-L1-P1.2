// Hier vullen we handmatig, stuk voor stuk, de array "foodArray":
foodArray[0] = instance_create(0 ,  0, obj_Food);
foodArray[1] = instance_create(32,  0, obj_Food);
foodArray[2] = instance_create(64,  0, obj_Food);
foodArray[3] = instance_create(96,  0, obj_Food);
foodArray[4] = instance_create( 0, 64, obj_Food);
foodArray[5] = instance_create(32, 64, obj_Food);


// Om een enkel object of stuk data in een Array aan te passen
// (Verplaats het eerste object 32 pixels naar beneden):
foodArray[0].y += 32;


var newArray = scr_FoodSpawner_GetFoodArray("tomaat");


// Weergeeft hoeveel objecten er in "foodArray" zitten:
show_message( string("Aantal Voedsel: ") + string(array_length_1d(foodArray)) );
