	import static org.junit.Assert.*;

import javax.swing.JButton;
import javax.swing.JFrame;

import fr.carboneIUT.presentation.Presentation;

import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class ControleurTest {
	
	private static Presentation main;
	private static JButton boutton;
	
	
	@BeforeClass
	public static void setUpBeforeClass() throws Exception{
		JFrame frame = new JFrame("Carbone IUT");
		main = new Presentation(frame);
	}
	
	@Before
	public void setUp() throws Exception {
		main.initModel();
	}
	
	@Test
	public void testClickTransportCO2VoiturePerso() {
		boutton=main.getpT().getBv();
		boutton.doClick();
		assertEquals(4.5, main.getCo2Min(), 0.1);//test co2 min
		assertEquals(20, main.getCo2Max(), 0.1);//test co2 min		
	}
	
	@Test
	public void testClickTransportCO2Covoiturage() {
		boutton=main.getpT().getBc();
		boutton.doClick();
		assertEquals(2, main.getCo2Min(), 0.1);//test co2 min
		assertEquals(10, main.getCo2Max(), 0.1);//test co2 min		
	}
	
	@Test
	public void testClickTransportCO2Velo() {
		boutton=main.getpT().getBve();
		boutton.doClick();
		assertEquals(0.001, main.getCo2Min(), 0.1);//test co2 min
		assertEquals(0.22, main.getCo2Max(), 0.1);//test co2 min		
	}
	
	@Test
	public void testClickTransportCO2TransportCommun() {
		boutton=main.getpT().getBtc();
		boutton.doClick();
		assertEquals(0.22, main.getCo2Min(), 0.1);//test co2 min
		assertEquals(1, main.getCo2Max(), 0.1);//test co2 min		
	}
	
	
	@Test
	public void testClickTransportCO2TransportAutre() {
		boutton=main.getpT().getBa();
		boutton.doClick();
		assertEquals(0, main.getCo2Min(), 0.1);//test co2 min
		assertEquals(20, main.getCo2Max(), 0.1);//test co2 min		
	}

}
