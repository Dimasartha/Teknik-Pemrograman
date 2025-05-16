package org.dimasarthah;

import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;

@DisplayName("Flight Tests with TDD")
public class AirportTest {
    private static final String PASSENGER_MIKE = "Mike";
    private static final String PASSENGER_JAMES = "James";

    @DisplayName("Given there is an economy flight")
    @Nested
    class EconomyFlightTest {
        @Test
        @DisplayName(
                "Then you can add and remove him from an economy flight")
        public void testEconomyFlightRegularPassenger() {
            Flight economyFlight = new EconomyFlight("1");
            Passenger mike = new Passenger(PASSENGER_MIKE, false);

            assertAll(
                    "Verify all conditions for a regular passenger and an economy flight",
                    () -> assertEquals("1", economyFlight.getId()),
                    () -> assertEquals(true,
                            economyFlight.addPassenger(mike)),
                    () -> assertEquals(1,
                            economyFlight.getPassengersList().size()),
                    () -> assertEquals(PASSENGER_MIKE,
                            economyFlight.getPassengersList()
                                    .get(0).getName()),
                    () -> assertEquals(true,
                            economyFlight.removePassenger(mike)),
                    () -> assertEquals(0,
                            economyFlight.getPassengersList().size())
            );
        }

        @Test
        @DisplayName("Then you can add him but cannot remove him from an economy flight")
        public void testEconomyFlightVipPassenger() {
            Flight economyFlight = new EconomyFlight("1");
            Passenger james = new Passenger(PASSENGER_JAMES, true);

            assertAll("Verify all conditions for a VIP passenger and an economy flight",
            () -> assertEquals("1", economyFlight.getId()),
                    () -> assertEquals(true,
                            economyFlight.addPassenger(james)),
                    () -> assertEquals(1,
                            economyFlight.getPassengersList().size()),
                    () -> assertEquals(PASSENGER_JAMES,
                            economyFlight.getPassengersList().get(0).getName()),
                    () -> assertEquals(false,
                            economyFlight.removePassenger(james)),
                    () -> assertEquals(1,
                            economyFlight.getPassengersList().size())
);
        }
    }

    @DisplayName("Given there is a business flight")
    @Nested
    class BusinessFlightTest {
        @Test
        @DisplayName("Then you cannot add or remove him from a business flight")
        public void testBusinessFlightRegularPassenger() {
            Flight businessFlight = new BusinessFlight("2");
            Passenger mike = new Passenger(PASSENGER_MIKE, false);

            assertAll("Verify all conditions for a regular passenger and a business flight",
            () -> assertEquals(false,
                    businessFlight.addPassenger(mike)),
                    () -> assertEquals(0,
                            businessFlight.getPassengersList().size()),
                    () -> assertEquals(false,
                            businessFlight.removePassenger(mike)),
                    () -> assertEquals(0,
                            businessFlight.getPassengersList().size())
);
        }

        @Test
        @DisplayName("Then you can add him but cannot remove him from a business flight")
        public void testBusinessFlightVipPassenger() {
            Flight businessFlight = new BusinessFlight("2");
            Passenger james = new Passenger(PASSENGER_JAMES, true);

            assertAll("Verify all conditions for a VIP passenger and a business flight",
                    () -> assertEquals(true,
                            businessFlight.addPassenger(james)),
                    () -> assertEquals(1,
                            businessFlight.getPassengersList().size()),
                    () -> assertEquals(false,
                            businessFlight.removePassenger(james)),
                    () -> assertEquals(1,
                            businessFlight.getPassengersList().size())
            );
        }
    }
}