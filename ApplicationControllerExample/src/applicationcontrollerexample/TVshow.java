
package applicationcontrollerexample;


class TVshow {
    
    private Firefly Firefly;
    private Dollhouse Dollhouse;
    private ThisIsUs ThisIsUs;
    private ChicagoPD ChicagoPD;
    private JamaicaInn JamaicaInn;
    private Scream Scream;
    private Helix Helix;
    private AndThenThereWereNone AndThenThereWereNone;
    private TheFlash TheFlash;
    private GapDong GapDong;
    private Goblin Goblin;
    private DescendantsOfTheSun DescendantsOfTheSun;
    
    public TVshow() {
	Firefly = new Firefly();
	Dollhouse = new Dollhouse();
	ThisIsUs = new ThisIsUs();
        ChicagoPD = new ChicagoPD();
        JamaicaInn= new JamaicaInn();
        Scream = new Scream();
        Helix = new Helix();
        AndThenThereWereNone = new AndThenThereWereNone();
        TheFlash = new TheFlash();
        GapDong = new GapDong();
        Goblin = new Goblin();
        DescendantsOfTheSun = new DescendantsOfTheSun();
    }
    
    public void tvshow(String request) {
	if(request.equalsIgnoreCase("Firefly")) {
            Firefly.info();
        }
	else if(request.equalsIgnoreCase("Dollhouse")) {
            Dollhouse.info();
	}
	else if(request.equalsIgnoreCase("ThisIsUs")) {
            ThisIsUs.info();
	}
	else if(request.equalsIgnoreCase("ChicagoPD")) {
            ChicagoPD.info();
	}  
	else if(request.equalsIgnoreCase("JamaicaInn")) {
            JamaicaInn.info();
	}
	else if(request.equalsIgnoreCase("Scream")) {
            Scream.info();
	}
	else if(request.equalsIgnoreCase("Helix")) {
            Helix.info();
	}
	else if(request.equalsIgnoreCase("AndThenThereWereNone")) {
            AndThenThereWereNone.info();
	}
	else if(request.equalsIgnoreCase("TheFlash")) {
            TheFlash.info();
	}
	else if(request.equalsIgnoreCase("GapDong")) {
            GapDong.info();
	}
	else if(request.equalsIgnoreCase("Goblin")) {
            Goblin.info();
	}
	else {
            DescendantsOfTheSun.info();
	}
    }
}
