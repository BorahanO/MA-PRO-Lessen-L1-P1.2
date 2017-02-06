keyPressed = false;

if (keyboard_check(ord("W")) && !keyPressed) {
    obj_Player.y -= self.moveSpeed;
    image_angle = 0;
    keyPressed = true;
}

if (keyboard_check(ord("S")) && !keyPressed) {
    obj_Player.y += self.moveSpeed;
    image_angle = 180;
    keyPressed = true;
}

if (keyboard_check(ord("D")) && !keyPressed) {
    obj_Player.x += self.moveSpeed;
    image_angle = 270;
    keyPressed = true;
}

if (keyboard_check(ord("A")) && !keyPressed) {
    obj_Player.x -= self.moveSpeed;
    image_angle = 90;
    keyPressed = true;
}

if(place_meeting(x, y - moveSpeed, obj_Wall_A) || place_meeting(x, y - moveSpeed, obj_Wall_B) || place_meeting(x, y - moveSpeed, obj_Water)) {
    y += moveSpeed;
}

if(place_meeting(x, y + moveSpeed, obj_Wall_A) || place_meeting(x, y + moveSpeed, obj_Wall_B)|| place_meeting(x, y + moveSpeed, obj_Water)) {
    y -= moveSpeed;
}

if(place_meeting(x - moveSpeed, y, obj_Wall_A) || place_meeting(x - moveSpeed, y, obj_Wall_B)|| place_meeting(x - moveSpeed, y, obj_Water)) {
    x += moveSpeed;
}

if(place_meeting(x + moveSpeed, y, obj_Wall_A) || place_meeting(x + moveSpeed, y, obj_Wall_B)|| place_meeting(x + moveSpeed, y, obj_Water)) {
    x -= moveSpeed;
}
