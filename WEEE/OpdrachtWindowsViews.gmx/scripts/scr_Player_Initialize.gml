
depth = 5;

scale     = y / (room_height * 0.75);
borderTop = room_height * 0.5;
moveSpeed = 10;

moveKeys[0] = ord('A'); // links
moveKeys[1] = ord('D'); // rechts
moveKeys[2] = ord('W'); // boven
moveKeys[3] = ord('S'); // beneden


moveDirFrameStart[0]    = 0;
moveDirFrameStart[1]    = 8;
moveDirFrameStart[2]    = 16;
moveDirFrameStart[3]    = 24;

framesPerAnimation      = 8;
currentFrame            = 0;
directionFrame          = 0;
