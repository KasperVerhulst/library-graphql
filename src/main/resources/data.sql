-- Insert authors
INSERT INTO author (id, first_name, last_name) VALUES
(1, 'George', 'Orwell'),
(2, 'Jane', 'Austen'),
(3, 'Mark', 'Twain');

-- Insert members
INSERT INTO member (id, first_name, last_name, email, birth_date, join_date) VALUES
(1, 'Alice', 'Smith', 'alice.smith@example.com', '1990-04-15', '2023-01-10'),
(2, 'Bob', 'Johnson', 'bob.johnson@example.com', '1985-09-22', '2022-06-05'),
(3, 'Clara', 'Nguyen', 'clara.nguyen@example.com', '1995-12-03', '2024-03-18');


-- Insert books
INSERT INTO book (id, title, genre, release_date, page_count, author_id) VALUES
(1, '1984', 0, '1949-06-08', 328, 1),
(2, 'Animal Farm', 0, '1945-08-17', 112, 1),
(3, 'Pride and Prejudice', 1, '1813-01-28', 279, 2),
(4, 'Emma', 1, '1815-12-23', 474, 2),
(5, 'Adventures of Huckleberry Finn', 2, '1884-12-10', 366, 3),
(6, 'The Adventures of Tom Sawyer', 2, '1876-06-01', 274, 3);
