package com.engeto.invoice;

import java.math.BigDecimal;
import java.time.LocalDate;

public class Main {


    public static void main(String[] args) {

String Name = "Karel Novotný";
LocalDate Birthdate = LocalDate.of(1995,5,7);
int Contract = 4;
int Quantity = 4;
String Town = "Praha";
String SPZ = "S1A 1567";
int FuelConsumption = 12;
String IPadress = "192.168.24.0";

int totalquantity = Quantity/Contract;
System.out.println("průměrné množství prodané mrkve na jednu smlouvu je "+ totalquantity+ " t");


    }
}