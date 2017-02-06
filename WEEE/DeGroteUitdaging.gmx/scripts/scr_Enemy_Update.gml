// Aftellen van beweegtijd:
if (moveTimeCurrent > 0)
{ moveTimeCurrent--; }
else
{
    // Zodra de tijd om is, bepaal de nieuwe richting.
    // Zet de tijd weer op zijn oorspronkelijke waarde.
    moveDirection = floor(random(4));
    moveTimeCurrent = moveTime;
}

if(place_meeting(x, y - moveSpeed, obj_Wall_A) || place_meeting(x, y - moveSpeed, obj_Wall_B) || place_meeting(x, y - moveSpeed, obj_Water)) {
    y += moveSpeed;
    moveDirection = floor(random(4));
}

if(place_meeting(x, y + moveSpeed, obj_Wall_A) || place_meeting(x, y + moveSpeed, obj_Wall_B)|| place_meeting(x, y + moveSpeed, obj_Water)) {
    y -= moveSpeed;
    moveDirection = floor(random(4));
}

if(place_meeting(x - moveSpeed, y, obj_Wall_A) || place_meeting(x - moveSpeed, y, obj_Wall_B)|| place_meeting(x - moveSpeed, y, obj_Water)) {
    x += moveSpeed;
    moveDirection = floor(random(4));
}

if(place_meeting(x + moveSpeed, y, obj_Wall_A) || place_meeting(x + moveSpeed, y, obj_Wall_B)|| place_meeting(x + moveSpeed, y, obj_Water)) {
    x -= moveSpeed;
    moveDirection = floor(random(4));
}

// Voer de beweging in de huidige richting uit:
if      (moveDirection == 0) // Links
{ x -= moveSpeed; image_angle = 90;}
else if (moveDirection == 1) // Rechts
{ x += moveSpeed; image_angle = 270;}
else if (moveDirection == 2) // Omhoog
{ y -= moveSpeed; image_angle = 0;}
else if (moveDirection == 3) // Omlaag
{ y += moveSpeed; image_angle = 180;}

if (shootCooldown <= 0) {
    var bullet = instance_create(self.x, self.y, obj_Bullet_Enemy);
    with(bullet) {
        moveDirection = other.image_angle;
    }
    shootCooldown = irandom(randomCoolDownPeriod) + minimumCoolDownPeriod;
} else {
    shootCooldown -= 1;
}
