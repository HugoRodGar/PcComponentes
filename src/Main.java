import dominio.*;

public class Main {

    public static void main(String[] args) {

        //CPU
        CPU cpu = new CPU();
        cpu.setMarca("");
        cpu.setGeneracion("");
        cpu.setNucleos("");
        cpu.setArquitectura("");
        cpu.setCache("");
        cpu.setVelocidad("");

        //RAM
        RAM ram = new RAM();
        ram.setMarca("");
        ram.setTipo("");
        ram.setCapacidad("");
        ram.setVelocidad("");

        //Paca Base
        PlacaBase placabase = new PlacaBase();
        placabase.setMarca("");
        placabase.setSocket("");
        placabase.setPuertosPCI("");
        placabase.setPuertosPCIe("");
        placabase.setPuertosSATA("");
        placabase.setMemoriaSoportada("");
        placabase.setDimensiones("");

        //Almacenamiento
        Almacenamiento almacenamiento = new Almacenamiento();
        almacenamiento.setMarca("");
        almacenamiento.setTipo("");
        almacenamiento.setCapacidad("");
        almacenamiento.setVelocidadLectura("");
        almacenamiento.setVelocidadEscritura("");

        //Fuente de alimentación
        FuenteAlimentacion fuentealimentacion = new FuenteAlimentacion();
        fuentealimentacion.setMarca("");
        fuentealimentacion.setPotencia("");
        fuentealimentacion.setConsumo("");
        fuentealimentacion.setDimensiones("");

        //Tarjeta Grafica
        TarjetaGrafica tarjetagrafica = new TarjetaGrafica();
        tarjetagrafica.setMarca("");
        tarjetagrafica.setModelo("");
        tarjetagrafica.setCapacidad("");
        tarjetagrafica.setDimensiones("");

        //Refrigeración
        Refrigeracion refrigeracion = new Refrigeracion();
        refrigeracion.setMarca("");
        refrigeracion.setTipo("");

        //Caja
        Caja caja = new Caja();
        caja.setMarca("");
        caja.setDimensiones("");


        //---------------------------------------------------


        //SOUT CPU
        System.out.println("CPU: \n");
        System.out.println(cpu.getMarca());
        System.out.println(cpu.getGeneracion());
        System.out.println(cpu.getNucleos());
        System.out.println(cpu.getArquitectura());
        System.out.println(cpu.getCache());
        System.out.println(cpu.getVelocidad());

        //SOUT RAM
        System.out.println("RAM: \n");
        System.out.println(ram.getMarca());
        System.out.println(ram.getTipo());
        System.out.println(ram.getCapacidad());
        System.out.println(ram.getVelocidad());

        //SOUT Placa Base
        System.out.println("Placa Base: \n");
        System.out.println(placabase.getMarca());
        System.out.println(placabase.getSocket());
        System.out.println(placabase.getPuertosPCI());
        System.out.println(placabase.getPuertosPCIe());
        System.out.println(placabase.getPuertosSATA());
        System.out.println(placabase.getMemoriaSoportada());
        System.out.println(placabase.getDimensiones());

        //SOUT Almacenamiento
        System.out.println("Almacenamiento: \n");
        System.out.println(almacenamiento.getMarca());
        System.out.println(almacenamiento.getTipo());
        System.out.println(almacenamiento.getCapacidad());
        System.out.println(almacenamiento.getVelocidadLectura());
        System.out.println(almacenamiento.getVelocidadEscritura());

        //SOUT Fuente de Alimentación
        System.out.println("Fuente de Alimentación: \n");
        System.out.println(fuentealimentacion.getMarca());
        System.out.println(fuentealimentacion.getPotencia());
        System.out.println(fuentealimentacion.getConsumo());
        System.out.println(fuentealimentacion.getDimensiones());

        //SOUT Tarjeta Grafica
        System.out.println("Tarjeta Grafica: \n");
        System.out.println(tarjetagrafica.getMarca());
        System.out.println(tarjetagrafica.getModelo());
        System.out.println(tarjetagrafica.getCapacidad());
        System.out.println(tarjetagrafica.getDimensiones());

        //SOUT Refrigeración
        System.out.println("Refrigeración: \n");
        System.out.println(refrigeracion.getMarca());
        System.out.println(refrigeracion.getTipo());

        //SOUT Caja
        System.out.println("Caja: \n");
        System.out.println(caja.getMarca());
        System.out.println(caja.getDimensiones());

    }
}