package com.example.tcarvajal3941.funfacts;

import java.util.Random;

public class FactBook {
    // Fields or Member Variables - Properties about the Object
    // Methods - Actions the object can take

    private String[] facts = {
            "You get more Nutrients eating the Shell of the Potato.",
            "You can tell how sick a Zebra is by how many Colors are Displayed by its Luxurious feathers.",
            "Elephants suck.",
            "Dandelions are the only fruit to successfully evolve to use echolocation when hunting at night",
            "Every time you breathe, the brain subconsciously takes some of that air and blows it on the rest of your organs to keep them at a nice, moderate temperature.",
            "The Earth is the only planet known to man.",
            "A woodchuck could, in fact, chuck 4 tons of wood a day, but only if assisted by the wide variety of mechanized tools developed by the mammal.",
            "The phrase, 'Humans only use 10% of their brain at any given time' is, in fact, false. Humans actually don't use their brains at all throughout their entire lifetime. All human thought and systemic control comes directly from the pancreas.",
            "The first human to ever use tools to accomplish a task was Minecraft's own 'Steve,' hence his portrayal in the modern remake of the fable.",
            "After the international tooth famine of the 1700's, the United Nations deemed it, 'inappropriate' to publicly speak of the Tooth Fairy, hence its lack of mention in the newer editions of the Catholic Bible.",
            "The Sun is a whopping 3 times the size of the modern steering wheel, making it the brightest object in the Galaxy that is also larger than a steering wheel.",
            "Isaac Newton single-handedly invented gravity at the mere age of 15. With this power he would go on to be the sole founder of the now Prestigious X-Men Academy.",
            "Rapper 2-Chainz founded the Mormon Church in 1830.",
            "During his presidency from 1857-1961, James (The Pepperoni) Buchanan ate approximately 12 whole Sausages of Pepperoni every day!"

    };

    public String getFact() {
        //Clicked Button, Create new Fact
        //Randomly select a fact
        Random randomGenerator = new Random();
        int randomNumber = randomGenerator.nextInt(facts.length);
        return facts[randomNumber];
    }
}
