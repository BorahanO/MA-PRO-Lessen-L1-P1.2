// OPDRACHT B:

// Controleren of er geraakt wordt:
if (collision_circle(x, y, 24, obj_Fireball, false, true) && playerHit == false)
{
    if (currentLives > 0)
    {
        currentLives--;
        currentPoints -= 15;
    }
    
    playerHit = true;
    hitTimeout = 60;
}
