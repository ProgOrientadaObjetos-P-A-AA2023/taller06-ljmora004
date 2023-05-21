package paquete01;

import java.util.Locale;
import java.util.Scanner;
import paquete02.Ciudad;
import paquete02.Enfermero;
import paquete02.Hospital;
import paquete02.Medico;

public class Principal {

    public static void main(String[] args) {

        Scanner ent = new Scanner(System.in);
        ent.useLocale(Locale.US);

        String nomHospital;
        String nomCiudad;
        String provincia;
        int nESpecialidades;
        String nomMedico;
        String especMedico;
        double salarioMedico;
        String nomEnfermero;
        String tipoEnfermero;
        double salarioEnfermero;
        int nMedicos;
        int nEnfermeros;
        Medico[] medicos;
        Enfermero[] enfermeros;

        System.out.println("Ingrese el nombre del hospital:");
        nomHospital = ent.nextLine();
        System.out.println("Ingrese el nombre de la ciudad:");
        nomCiudad = ent.nextLine();
        System.out.println("Ingrese el nombre de la provincia:");
        provincia = ent.nextLine();
        System.out.println("Ingrese el número de especialidades médicas:");
        nESpecialidades = ent.nextInt();
        System.out.println("Ingrese el número de medicos a registrar:");
        nMedicos = ent.nextInt();

        medicos = new Medico[nMedicos];
        for (int i = 0; i < nMedicos; i++) {
            ent.nextLine();
            System.out.println("Ingrese el nombre del médico:");
            nomMedico = ent.nextLine();
            System.out.println("Ingrese la especialidad del médico:");
            especMedico = ent.nextLine();
            System.out.println("Ingrese el salario del médico:");
            salarioMedico = ent.nextDouble();

            medicos[i] = new Medico(nomMedico, especMedico,
                    salarioMedico);

        }

        System.out.println("Ingrese el número de enfermeros a registrar:");
        nEnfermeros = ent.nextInt();

        enfermeros = new Enfermero[nEnfermeros];
        for (int i = 0; i < nEnfermeros; i++) {
            ent.nextLine();
            System.out.println("Ingrese el nombre del enfermero:");
            nomEnfermero = ent.nextLine();
            System.out.println("Ingrese el tipo de enfermero "
                    + "(nombramiento - contrato):");
            tipoEnfermero = ent.nextLine();
            System.out.println("Ingrese el salario del enfermero:");
            salarioEnfermero = ent.nextDouble();

            enfermeros[i] = new Enfermero(nomEnfermero, tipoEnfermero,
                    salarioEnfermero);
        }

        Ciudad ciudad = new Ciudad(nomCiudad, provincia);

        Hospital hospital = new Hospital(nomHospital, ciudad,
                nESpecialidades, medicos, enfermeros);
        hospital.calcularSueldosPagar();

        System.out.printf("%s\n", hospital);
    }

}
