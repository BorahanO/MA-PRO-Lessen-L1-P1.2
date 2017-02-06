// OPDRACHT A, B & C:

ini_open("savegame.ini");

var xpos = ini_read_string("player", "xPos", base64_encode(string(0)));
var ypos = ini_read_string("player", "yPos", base64_encode(string(0)));

ini_close();

xpos = real(base64_decode(xpos));
ypos = real(base64_decode(ypos));

obj_Player.x = xpos;
obj_Player.y = ypos;
