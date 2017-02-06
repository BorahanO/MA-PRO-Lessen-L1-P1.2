timer++;
if (timer >= timerInterval)
{
    // Creëer een vuurbal op een willekeurige plaats buiten het scherm:
    var ballX, ballY;
    var randomSide = irandom_range(1, 4);
    
    if (randomSide == 1)
    {
        // Links:
        ballX = 0;
        ballY = irandom_range(0, room_height);
    }
    else if (randomSide == 2)
    {
        // Rechts:
        ballX = room_width;
        ballY = irandom_range(0, room_height);
    }
    else if (randomSide == 3)
    {
        // Boven:
        ballX = irandom_range(0, room_width);
        ballY = 0;
    }
    else
    {
        // Beneden:
        ballX = irandom_range(0, room_width);
        ballY = room_height;
    }
    
    instance_create(ballX, ballY, obj_Fireball);
    
    
    // Zet de timer weer terug op 0:
    timer = 0;
}
