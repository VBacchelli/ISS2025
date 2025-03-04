package unibo.disi.conwaygui;

import org.springframework.boot.autoconfigure.SpringBootApplication;

import conway.Life;
import conway.LifeController;
import conway.devices.ConwayInputMock;

@SpringBootApplication
public class ConwayguiApplication {

    public static void main(String[] args) {
    //sysUtil.aboutThreads("MainConway | STARTS " ); //Richiede dipendenze
    	//configureTheSystem
        Life life           = new Life( 3,3 );
        LifeController cc   = new LifeController(life);   
        ConwayInputMock cim = new ConwayInputMock(cc,life);
        //start the system
        cim.simulateUserControl();
        
    }

}
