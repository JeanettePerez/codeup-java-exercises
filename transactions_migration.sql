USE bank_db;
DROP TABLE if exists transactions;
CREATE TABLE transactions (
  id INT UNSIGNED NOT NULL AUTO_INCREMENT,
  date TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
  description varchar(100),
  memo TEXT NOT NULL,
  amount DECIMAL(10, 2) NOT NULL,
  transaction_successful TINYINT NOT NULL,
  PRIMARY KEY(id)
);
