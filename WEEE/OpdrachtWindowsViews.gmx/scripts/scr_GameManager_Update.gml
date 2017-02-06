timer++;
if (timer >= timerInterval)
{
    instance_create(random_range(0, room_width - 32), -32, obj_Enemy);
    
    // Zet de timer weer terug op 0:
    timer = 0;
}


scr_GameManager_OnView();
