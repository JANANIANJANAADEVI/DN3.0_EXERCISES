
public class BuilderPatternTest {

	public static void main(String[] args) {
		 Computer gamingComputer = new Computer.Builder()
		            .setCPU("Intel i9")
		            .setRAM("32GB")
		            .setStorage("1TB SSD")
		            .setGPU("NVIDIA RTX 3080")
		            .setPowerSupply("750W")
		            .setMotherboard("ASUS ROG")
		            .build();

		        Computer officeComputer = new Computer.Builder()
		            .setCPU("Intel i5")
		            .setRAM("16GB")
		            .setStorage("512GB SSD")
		            .build();

		        // Display configurations
		        System.out.println("Gaming Computer Configuration:");
		        System.out.println("CPU: " + gamingComputer.getCPU());
		        System.out.println("RAM: " + gamingComputer.getRAM());
		        System.out.println("Storage: " + gamingComputer.getStorage());
		        System.out.println("GPU: " + gamingComputer.getGPU());
		        System.out.println("Power Supply: " + gamingComputer.getPowerSupply());
		        System.out.println("Motherboard: " + gamingComputer.getMotherboard());

		        System.out.println("\nOffice Computer Configuration:");
		        System.out.println("CPU: " + officeComputer.getCPU());
		        System.out.println("RAM: " + officeComputer.getRAM());
		        System.out.println("Storage: " + officeComputer.getStorage());

	}

}
