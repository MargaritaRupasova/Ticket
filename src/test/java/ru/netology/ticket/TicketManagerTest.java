package ru.netology.ticket;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TicketManagerTest {

   @Test
   public void searchOneTicket() {
       TicketRepository repo = new TicketRepository();
       TicketManager manager = new TicketManager(repo);
       Ticket ticket1 = new Ticket(1, 2000, "MOW", "LED", 95);
       Ticket ticket2 = new Ticket(2, 2000, "MOW", "LED", 90);
       Ticket ticket3 = new Ticket(3, 2200, "MOW", "GOJ", 80);
       Ticket ticket4 = new Ticket(4, 4000, "MOW", "LED", 60);
       Ticket ticket5 = new Ticket(5, 2000, "LED", "GOJ", 95);
       Ticket ticket6 = new Ticket(6, 300, "GOJ", "LED", 95);
       Ticket ticket7 = new Ticket(7, 400, "MOW", "LED", 90);
       Ticket ticket8 = new Ticket(8, 2200, "MOW", "GOJ", 70);
       Ticket ticket9 = new Ticket(9, 5000, "GOJ", "LED", 60);
       Ticket ticket10 = new Ticket(10, 2000, "MOW", "GOJ", 95);

       manager.add(ticket1);
       manager.add(ticket2);
       manager.add(ticket3);
       manager.add(ticket4);
       manager.add(ticket5);
       manager.add(ticket6);
       manager.add(ticket7);
       manager.add(ticket8);
       manager.add(ticket9);
       manager.add(ticket10);

       Ticket[] expected = { ticket5 };
       Ticket[] actual = manager.findAll("LED", "GOJ");

       Assertions.assertArrayEquals(expected, actual);
   }

    @Test
    public void searchNotTicket() {
        TicketRepository repo = new TicketRepository();
        TicketManager manager = new TicketManager(repo);
        Ticket ticket1 = new Ticket(1, 2000, "MOW", "LED", 95);
        Ticket ticket2 = new Ticket(2, 2000, "MOW", "LED", 90);
        Ticket ticket3 = new Ticket(3, 2200, "MOW", "GOJ", 80);
        Ticket ticket4 = new Ticket(4, 4000, "MOW", "LED", 60);
        Ticket ticket5 = new Ticket(5, 2000, "LED", "GOJ", 95);
        Ticket ticket6 = new Ticket(6, 300, "GOJ", "LED", 95);
        Ticket ticket7 = new Ticket(7, 400, "MOW", "LED", 90);
        Ticket ticket8 = new Ticket(8, 2200, "MOW", "GOJ", 70);
        Ticket ticket9 = new Ticket(9, 5000, "GOJ", "LED", 60);
        Ticket ticket10 = new Ticket(10, 2000, "MOW", "GOJ", 95);

        manager.add(ticket1);
        manager.add(ticket2);
        manager.add(ticket3);
        manager.add(ticket4);
        manager.add(ticket5);
        manager.add(ticket6);
        manager.add(ticket7);
        manager.add(ticket8);
        manager.add(ticket9);
        manager.add(ticket10);

        Ticket[] expected = { };
        Ticket[] actual = manager.findAll("GOJ", "MOW");

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void searchFiveTicket() {
        TicketRepository repo = new TicketRepository();
        TicketManager manager = new TicketManager(repo);
        Ticket ticket1 = new Ticket(1, 2000, "MOW", "LED", 95);
        Ticket ticket2 = new Ticket(2, 2000, "MOW", "LED", 90);
        Ticket ticket3 = new Ticket(3, 2200, "MOW", "GOJ", 80);
        Ticket ticket4 = new Ticket(4, 4000, "MOW", "LED", 60);
        Ticket ticket5 = new Ticket(5, 2000, "LED", "GOJ", 95);
        Ticket ticket6 = new Ticket(6, 300, "GOJ", "LED", 95);
        Ticket ticket7 = new Ticket(7, 400, "MOW", "LED", 90);
        Ticket ticket8 = new Ticket(8, 2200, "MOW", "GOJ", 70);
        Ticket ticket9 = new Ticket(9, 5000, "GOJ", "LED", 60);
        Ticket ticket10 = new Ticket(10, 2200, "MOW", "LED", 95);

        manager.add(ticket1);
        manager.add(ticket2);
        manager.add(ticket3);
        manager.add(ticket4);
        manager.add(ticket5);
        manager.add(ticket6);
        manager.add(ticket7);
        manager.add(ticket8);
        manager.add(ticket9);
        manager.add(ticket10);

        Ticket[] expected = { ticket7, ticket1, ticket2, ticket10, ticket4 };
        Ticket[] actual = manager.findAll("MOW", "LED");

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void searchFiveSortedTicket() {
        TicketRepository repo = new TicketRepository();
        TicketManager manager = new TicketManager(repo);
        Ticket ticket1 = new Ticket(1, 200, "MOW", "LED", 95);
        Ticket ticket2 = new Ticket(2, 300, "MOW", "LED", 90);
        Ticket ticket3 = new Ticket(3, 2200, "MOW", "GOJ", 80);
        Ticket ticket4 = new Ticket(4, 500, "MOW", "LED", 60);
        Ticket ticket5 = new Ticket(5, 2000, "LED", "GOJ", 95);
        Ticket ticket6 = new Ticket(6, 300, "GOJ", "LED", 95);
        Ticket ticket7 = new Ticket(7, 800, "MOW", "LED", 90);
        Ticket ticket8 = new Ticket(8, 2200, "MOW", "GOJ", 70);
        Ticket ticket9 = new Ticket(9, 5000, "GOJ", "LED", 60);
        Ticket ticket10 = new Ticket(10, 2200, "MOW", "LED", 95);

        manager.add(ticket1);
        manager.add(ticket2);
        manager.add(ticket3);
        manager.add(ticket4);
        manager.add(ticket5);
        manager.add(ticket6);
        manager.add(ticket7);
        manager.add(ticket8);
        manager.add(ticket9);
        manager.add(ticket10);

        Ticket[] expected = { ticket1, ticket2, ticket4, ticket7, ticket10 };
        Ticket[] actual = manager.findAll("MOW", "LED");

        Assertions.assertArrayEquals(expected, actual);
    }
}