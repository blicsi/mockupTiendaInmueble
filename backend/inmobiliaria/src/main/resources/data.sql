-- =========================
-- CLIENTS
-- =========================
INSERT INTO client (client_id, name, role, email, phone) VALUES
(1, 'John Buyer', 'BUYER', 'john@email.com', '111111111'),
(2, 'Mary Seller', 'SELLER', 'mary@email.com', '222222222'),
(3, 'Carlos Investor', 'BUYER', 'carlos@email.com', '333333333');


-- =========================
-- AGENTS
-- =========================
INSERT INTO agent (agent_id, name, email, phone) VALUES
(1, 'Agent Smith', 'smith@agency.com', '444444444'),
(2, 'Agent Johnson', 'johnson@agency.com', '555555555');


-- =========================
-- PROPERTIES
-- =========================
INSERT INTO property (property_id, address, type, "size", price, status) VALUES
(1, '742 Evergreen Terrace', 'House', 180.0, 250000, 'AVAILABLE'),
(2, '123 Main Street', 'Apartment', 90.0, 120000, 'AVAILABLE'),
(3, '456 Ocean Drive', 'House', 210.0, 350000, 'AVAILABLE');


-- =========================
-- LISTINGS
-- =========================
INSERT INTO listing (listing_id, date_listed, property_id, agent_id) VALUES
(1, '2026-01-10', 1, 1),
(2, '2026-01-15', 2, 2),
(3, '2026-01-20', 3, 1);


-- =========================
-- APPOINTMENTS
-- =========================
INSERT INTO appointment (appointment_id, "date", "time", client_id, listing_id) VALUES
(1, '2026-02-01', '10:00:00', 1, 1),
(2, '2026-02-02', '14:30:00', 3, 2);


-- =========================
-- TRANSACTIONS
-- =========================
INSERT INTO "transaction" (transaction_id, date, price, property_id, buyer_id, seller_id) VALUES
(1, '2026-02-05', 245000, 1, 1, 2),
(2, '2026-02-06', 118000, 2, 3, 2);


-- =========================
-- PAYMENTS
-- =========================
INSERT INTO payment (payment_id, amount, date, transaction_id) VALUES
(1, 50000, '2026-02-05', 1),
(2, 195000, '2026-02-06', 1),
(3, 118000, '2026-02-06', 2);