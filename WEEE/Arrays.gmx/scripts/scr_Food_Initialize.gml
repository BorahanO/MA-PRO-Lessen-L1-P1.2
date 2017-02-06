// image_speed = De animatie-snelheid van de sprite.
// Zet op 0 om geen animatie te tonen:
image_speed = 0;

// image_index = De gekozen afbeelding uit de reeks.
// [MOET EEN AFGEROND GETAL ZIJN! Naar beneden afronden = floor(...) ]
// Kies een willekeurige afbeelding (index) uit de sprite:
randomize();
image_index = floor(random(sprite_get_number(spr_Food)));


nameArray[0] = "tomaat";
nameArray[1] = "kers";
nameArray[2] = "sushi";
nameArray[3] = "burger";
nameArray[4] = "sinaasappel";
nameArray[5] = "ei";


// Aan de hand van het plaatje bepalen we hoe we het eten noemen:
name = nameArray[image_index];


