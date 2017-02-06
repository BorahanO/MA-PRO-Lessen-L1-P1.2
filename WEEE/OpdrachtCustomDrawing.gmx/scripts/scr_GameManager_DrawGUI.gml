// OPDRACHT A:
// Teken hier de score en levens van de speler op het scherm door middel van
// het tekenen van tekst en sprites.
draw_set_font(font_Centaur);
draw_text_colour(10,10,"Points: " + string(obj_Player.currentPoints), c_aqua, c_aqua, c_aqua, c_aqua, 1);

draw_text_colour(10,50,"Timeout: " + string(obj_Player.hitTimeout), c_aqua, c_aqua, c_aqua, c_aqua, 1);

if(curRound > 25) {
    curRound = 0;
}

for(var i = 0; i < obj_Player.currentLives; i++) {
    draw_sprite_ext(spr_Lives, curRound, room_width - 50, 50 + (i * 50), 2, 2, 0, c_white, 1);
}

curRound++;
