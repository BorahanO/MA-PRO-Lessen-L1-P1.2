// OPDRACHT B:

// Controleren of er geraakt wordt:
if (collision_circle(x, y, 24, obj_Fireball, false, true))
{
    if (currentLives > 0)
    {
        currentLives--;
        currentPoints -= 15;
    }
}
