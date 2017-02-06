amount = argument0;
currentHealth -= amount;
    
if currentHealth <= 0 {
    global.points += global.ppk;
    instance_destroy();
}
