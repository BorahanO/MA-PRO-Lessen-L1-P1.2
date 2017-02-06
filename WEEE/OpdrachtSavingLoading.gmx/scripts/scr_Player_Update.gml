
var isMoving = false;
for (var i = 0; i < array_length_1d(moveKeys); i++)
{
    if (keyboard_check(moveKeys[i]))
    {
        isMoving = true;
        directionFrame = moveDirFrameStart[i];
        scr_Player_Update_Move(moveKeys[i]);
    }
}

if (isMoving)
{
    currentFrame++;
    if (currentFrame >= framesPerAnimation)
    { currentFrame = 0; }
}
else
{
    currentFrame = 0;
}


