/*
    
    Opdracht A = 6:
    
    Sla de gegevens van de speler op volgens de .ini structuur.
    Zorg ervoor dat de positie van de speler wordt opgeslagen als
    je op ENTER drukt. Zodra je op BACKSPACE drukt moet de speler
    weer terug op de laatst opgeslagen positie terecht komen.
    
    JE MAG ALLEEN GEBRUIK MAKEN VAN ZELF-GESCHREVEN SCRIPTS!
    (Dus geen andere drag-drop onderdelen meer gebruiken anders
    dan de "Execute Script" functies!)
    
    Werk de code uit in de volgende scripts:
        - scr_GameManager_Update
        - scr_GameManager_Save
        - scr_GameManager_Load
    
    
    Opdracht B = 8:
    
    De data die opgeslagen wordt moet geëncodeerd worden om te
    voorkomen dat anderen het bestand op makkelijke wijze kunnen
    aanpassen. Dit betekent dat de data die in het .ini-bestand
    opgeslagen is, als het bestand door een gebruiker zelf geopend
    wordt in de "Windows Explorer", onbegrijpbaar moet zijn voor
    mensen.
    
    Alleen de WAARDES van het .ini-bestand moeten worden geëncodeerd!
    Zorg ervoor dat het opslaan en laden nog steeds correct werkt
    als in opdracht A! Een voorbeeld van zo'n geëncodeerde waarde
    in een .ini-bestand ziet er bijvoorbeeld zo uit:
    
        [speler]
        wapen=skW2bSp
    
    Werk de code uit in de volgende scripts:
        - scr_GameManager_Save
        - scr_GameManager_Load
    
    
    Opdracht C = 10:
    
    Zorg ervoor dat het HELE .ini bestand van de speler geëncodeerd
    wordt terwijl het opslaan en laden nog gewoon moet werken.
    Het bestand moet worden omgetoverd tot een ".sav" bestand en
    het oorspronkelijke .ini-bestand mag niet meer aanwezig zijn.
    
    Het volledige .ini-bestand moet dus vervangen worden met een
    volledig geëncodeerd .sav-bestand die DE VOLLEDIGE STRUCTUUR 
    EN ALLE DATA VAN HET OORSPRONKELIJKE .ini-BESTAND MOET BEHOUDEN!
    Opdracht A moet nog steeds volgens het .ini-bestanden structuur
    de data kunnen ophalen.
    
    Werk de code uit in de volgende scripts:
        - scr_GameManager_Save
        - scr_GameManager_Load
    
    
    Tip: Zoek de functie "ini_open_from_string" op.
    
*/
