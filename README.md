# parking_lot

I own a parking lot that can hold up to 'n' cars at any given point in time. Each slot is given a number
starting at 1 increasing with increasing distance from the entry point in steps of one. I want to create an
automated ticketing system that allows my customers to use my parking lot without human intervention.
When a car enters my parking lot, I want to have a ticket issued to the driver. The ticket issuing process
includes us documenting the registration number (number plate) and the colour of the car and allocating
an available parking slot to the car before actually handing over a ticket to the driver (we assume that our
customers are nice enough to always park in the slots allocated to them). The customer should be
allocated a parking slot which is nearest to the entry. At the exit the customer returns the ticket with the
time the car was parked in the lot, which then marks the slot they were using as being available. Total
parking charge should be calculated as per the parking time. Charge applicable is $10 for first 2 hours
and $10 for every additional hour.
We interact with the system via a simple set of commands which produce a specific output. Please take a
look at the example below, which includes all the commands you need to support - they're selfexplanatory.
The system should accept a filename as a parameter at the command prompt and read the
commands from that file.

The project can be run with the below commands 
1. ./parking_lot.sh <input_filepath>  
   
2. ./parking_lot.sh 
   This will start the program 
   The commands are as follows:
   create_parking_lot <no_of_slots>
   park <reg_no> <color>
   leave <slot_number>
   status
   
