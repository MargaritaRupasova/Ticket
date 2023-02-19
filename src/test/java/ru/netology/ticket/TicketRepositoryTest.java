package ru.netology.ticket;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.awt.event.MouseWheelEvent;

public class TicketRepositoryTest {

    @Test
    public void getAllTicket() {
        TicketRepository repo = new TicketRepository();
        Ticket ticket1 = new Ticket(1, 2000, "MOW", "LED", 95);
        Ticket ticket2 = new Ticket(2, 2000, "MOW", "LED", 90);
        Ticket ticket3 = new Ticket(3, 2200, "MOW", "GOJ", 80);
        Ticket ticket4 = new Ticket(4, 4000, "MOW", "LED", 60);
        Ticket ticket5 = new Ticket(5, 2000, "LED", "GOJ", 95);
        Ticket ticket6 = new Ticket(6, 300, "GOJ", "LED", 95);
        Ticket ticket7 = new Ticket(7, 400, "MOW", "LED", 90);
        Ticket ticket8 = new Ticket(8, 2200, "MOW", "GOJ", 70);
        Ticket ticket9 = new Ticket(9, 5000, "GOJ", "LED", 60);
        Ticket ticket10 = new Ticket(10, 2000, "LED", "GOJ", 95);

        repo.add(ticket1);
        repo.add(ticket2);
        repo.add(ticket3);
        repo.add(ticket4);
        repo.add(ticket5);
        repo.add(ticket6);
        repo.add(ticket7);
        repo.add(ticket8);
        repo.add(ticket9);
        repo.add(ticket10);

        Ticket[] expected = {ticket1, ticket2, ticket3, ticket4, ticket5, ticket6, ticket7, ticket8, ticket9, ticket10};
        Ticket[] actual = repo.findAll();

        Assertions.assertArrayEquals(expected, actual);
    }

}
