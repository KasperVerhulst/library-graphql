-- Insert authors
INSERT INTO author (first_name, last_name) VALUES
('George', 'Orwell'),
('Jane', 'Austen'),
('Mark', 'Twain');

-- Insert members
INSERT INTO member (first_name, last_name, email, birth_date, join_date) VALUES
('Alice', 'Smith', 'alice.smith@example.com', '1990-04-15', '2023-01-10'),
( 'Bob', 'Johnson', 'bob.johnson@example.com', '1985-09-22', '2022-06-05'),
( 'Clara', 'Nguyen', 'clara.nguyen@example.com', '1995-12-03', '2024-03-18');


-- Insert books
INSERT INTO book (title, genre, release_date, page_count, author_id) VALUES
('1984', 0, '1949-06-08', 328, 1),
('Animal Farm', 0, '1945-08-17', 112, 1),
('Pride and Prejudice', 1, '1813-01-28', 279, 2),
('Emma', 1, '1815-12-23', 474, 2),
('Adventures of Huckleberry Finn', 2, '1884-12-10', 366, 3),
('The Adventures of Tom Sawyer', 2, '1876-06-01', 274, 3);
