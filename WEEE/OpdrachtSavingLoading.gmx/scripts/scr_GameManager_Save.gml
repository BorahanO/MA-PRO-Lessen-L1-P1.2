// OPDRACHT A, B & C:

ini_open("savegame.ini");

// In this case its both base64 encoded
ini_write_string("player", "xPos", base64_encode(string(obj_Player.x)));
ini_write_string("player", "yPos", base64_encode(string(obj_Player.y)));

ini_close()

