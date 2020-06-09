package com.parking;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

import com.parking.Impl.ParkingLotImpl;

import com.parking.model.Car;
import com.parking.model.Commands;

public class ParkingLotMain{
	public static void main(String[] args){
		ParkingLotImpl parkingLot;
		
		Scanner sc ;
		try {
			
			if(args.length > 0){
				String fileName = args[0];
				File f = new File(fileName);
				sc = new Scanner(f);
			}
			else
				sc = new Scanner(System.in);
			String line, command,hour;
			String regNo, colour;
			int parking_res;
			int num;
			line = sc.nextLine();
			int count= Integer.parseInt(line.split(" ")[1]);
			parkingLot = new ParkingLotImpl(count);
			System.out.println("Created a parking lot with "+count+" slots");
			while(sc.hasNextLine()){
				line = sc.nextLine();
				String[] commandLine = line.split(" ");
				command = commandLine[0];
				switch(Commands.getCommand(command)){
				case LEAVE:
					num = Integer.parseInt(commandLine[1]);
					//hour=commandLine[2];
					parkingLot.leaveCar(num-1);
					//parking_res =parkingLot.parkCar(new (hour));
					System.out.println("Slot number "+num+" is free");
					break;
				case PARK:
					regNo = commandLine[1];
					colour = commandLine[2];
					parking_res =parkingLot.parkCar(new Car(regNo, colour));
					if(parking_res != -1){
						System.out.println("Allocated Slot Number: "+parking_res);
					}
					else
						System.out.println("Sorry, parking lot is full");
					break;
//				case REG_NUMBERS:
//					Color = commandLine[1];
//					parkingLot.getRegNumberForColor(colour);
//					break;
//				case SLOT_COLOUR:
//					Color = commandLine[1];
//					parkingLot.getSlotNumberForColor(colour);
//					break;
//				case SLOT_REG:
//					regNo = commandLine[1];
//					parking_res = parkingLot.getSlotNumberForReqNumber(regNo);
//					if(parking_res != -1){
//						System.out.println(parking_res);
//					}
//					else
//						System.out.println("Not Found");
//					break;
				case STATUS:
					parkingLot.getStatus();
					break;
				default:
					break;
				}
			}
		} catch (FileNotFoundException e) {
			System.out.println("File not found");
		}
	}
}