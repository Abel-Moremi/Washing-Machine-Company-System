/**
 * Author:  Abel Moremi 201503625
 * Created: Sep 17, 2020
 */

CREATE TABLE T_WMC(
    wmc_Name varchar(20) NOT NULL,
	
    CONSTRAINT PK_WMC PRIMARY KEY(wmc_Name)
);

CREATE TABLE T_Part(
	part_PartNo varchar(20) NOT NULL,
	part_description varchar(20),
	part_cost int,
	part_manufactureDate DATE DEFAULT CURRENT_TIMESTAMP,
	
	CONSTRAINT PK_Part PRIMARY KEY(part_PartNo),
	CONSTRAINT CHK_part_cost CHECK (part_cost>=20 AND part_cost<=500)
);

CREATE TABLE T_Customer(
    customer_CNo varchar(20) NOT NULL,
	customer_Name varchar(20),
	customer_surname varchar(20),
	
    CONSTRAINT PK_Customer PRIMARY KEY(customer_CNo)
);

CREATE TABLE T_Machine(
    machine_MNo varchar(20) NOT NULL,
	
    CONSTRAINT PK_Machine PRIMARY KEY(machine_MNo)
);

CREATE TABLE T_Employee(
    employee_ENo varchar(20) NOT NULL,
    employee_Name varchar(20),
    employee_Designation varchar(20) DEFAULT 'Operator',
    employee_Salary int,
	
    CONSTRAINT PK_Employee PRIMARY KEY(employee_ENo)
);

CREATE TABLE T_Product(
    product_MNo varchar(20) NOT NULL,
    product_PrName varchar(20),
    product_cost int,
    product_WMC_name varchar(20),
	
    CONSTRAINT PK_Product PRIMARY KEY(product_MNo),
    CONSTRAINT FK_Product_WMC_name FOREIGN KEY (product_WMC_name) REFERENCES T_WMC(wmc_Name)
);

CREATE TABLE T_Assembles(
    assembles_product_PNo varchar(20) NOT NULL,
    assembles_part_PartNo varchar(20) NOT NULL,
	
    CONSTRAINT PK_Assembles PRIMARY KEY(assembles_product_PNo, assembles_part_PartNo),
    CONSTRAINT FK_Assembles_Product_PNo FOREIGN KEY (assembles_product_PNo) REFERENCES T_Product(product_MNo),
    CONSTRAINT FK_Assembles_Part_PartNo FOREIGN KEY (assembles_part_PartNo) REFERENCES T_Part(part_PartNo)
);

CREATE TABLE T_Orders(
    orders_product_PNo varchar(20) NOT NULL,
    orders_customer_CNo varchar(20) NOT NULL,
	
    CONSTRAINT PK_Orders PRIMARY KEY(orders_product_PNo,  orders_customer_CNo),
    CONSTRAINT FK_Orders_Product_PNo FOREIGN KEY (orders_product_PNo) REFERENCES T_Product(product_MNo),
    CONSTRAINT FK_Orders_Customer_CNo FOREIGN KEY (orders_customer_CNo) REFERENCES T_Customer(customer_CNo)
);

CREATE TABLE T_MadeOn(
    madeon_machine_MNo varchar(20) NOT NULL,
    madeon_part_PartNo varchar(20) NOT NULL,
	
    CONSTRAINT PK_MadeOn PRIMARY KEY(madeon_machine_MNo,  madeon_part_PartNo),
    CONSTRAINT FK_MadeOn_machine_MNo FOREIGN KEY (madeon_machine_MNo) REFERENCES T_Machine(machine_MNo),
    CONSTRAINT FK_MadeOn_part_PartNo FOREIGN KEY (madeon_part_PartNo) REFERENCES T_Part(part_PartNo)
);

CREATE TABLE T_Supervisor(
    supervisor_machine_MNo varchar(20) NOT NULL,
    supervisor_employee_ENo varchar(20) NOT NULL,
	
    CONSTRAINT PK_Supervisor PRIMARY KEY(supervisor_machine_MNo,  supervisor_employee_ENo),
    CONSTRAINT FK_Supervisor_Machine_MNo FOREIGN KEY (supervisor_machine_MNo) REFERENCES T_Machine(machine_MNo),
    CONSTRAINT FK_Supervisor_Employee_ENo FOREIGN KEY (supervisor_employee_ENo) REFERENCES T_Employee(employee_ENo)
);

CREATE TABLE T_MadeBy(
    madeby_part_PartNo varchar(20) NOT NULL,
    madeby_employee_ENo varchar(20) NOT NULL,
	
    CONSTRAINT PK_MadeBy PRIMARY KEY(madeby_part_PartNo, madeby_employee_ENo),
    CONSTRAINT FK_MadeBy_Part_PartNo FOREIGN KEY (madeby_part_PartNo) REFERENCES T_Machine(machine_MNo),
    CONSTRAINT FK_MadeBy_Employee_ENo FOREIGN KEY (madeby_employee_ENo) REFERENCES T_Part(part_PartNo)
);

CREATE TABLE T_Operator(
    operator_machine_MNo varchar(20) NOT NULL,
    operator_employee_ENo varchar(20) NOT NULL,
    operator_NoOfParts INT,
	
    CONSTRAINT PK_Operator PRIMARY KEY(operator_machine_MNo,  operator_employee_ENo),
    CONSTRAINT FK_Operator_Machine_MNo FOREIGN KEY (operator_machine_MNo) REFERENCES T_Machine(machine_MNo),
    CONSTRAINT FK_Operator_Employee_ENo FOREIGN KEY (operator_employee_ENo) REFERENCES T_Employee(employee_ENo)
);


/*CREATE OR REPLACE FUNCTION fn_operatorNumberOfParts (@employee_ENo varchar(20) ) 
RETURNS INT 
AS 
     BEGIN 
         DECLARE @newNoOfParts Int; 
         SELECT @newNoOfParts = COUNT(T_MadeBy.madeby_employee_ENo) 
         FROM T_MadeBy 
         WHERE T_MadeBy.madeby_employee_ENo = @employee_ENo; 
         RETURN @newNoOfParts; 
     END;

CREATE TABLE T_Operator(
    operator_machine_MNo varchar(20) NOT NULL,
    operator_employee_ENo varchar(20) NOT NULL,
    operator_NoOfParts AS fn_operatorNumberOfParts(operator_employee_ENo),
	
    CONSTRAINT PK_Operator PRIMARY KEY(operator_machine_MNo,  operator_employee_ENo),
    CONSTRAINT FK_Operator_Machine_MNo FOREIGN KEY (operator_machine_MNo) REFERENCES T_Machine(machine_MNo),
    CONSTRAINT FK_Operator_Employee_ENo FOREIGN KEY (operator_employee_ENo) REFERENCES T_Employee(employee_ENo)
); */


-- The following are Data insertions into the tables to form dummy data.
-- Data Entry

-- T_WMC
INSERT INTO T_WMC
VALUES ('Moremi Cooperation');

-- T_Part
INSERT INTO T_Part (part_PartNo, part_description, part_cost)
VALUES ('FK-01245', 'Glass Window', 20);

INSERT INTO T_Part (part_PartNo, part_description, part_cost)
VALUES ('FK-01246', 'Electric Panel', 10);

INSERT INTO T_Part (part_PartNo, part_description, part_cost)
VALUES ('FK-01247', 'Motor', 200);

INSERT INTO T_Part (part_PartNo, part_description, part_cost)
VALUES ('FK-01248', 'Drum', 100);

INSERT INTO T_Part (part_PartNo, part_description, part_cost)
VALUES ('FK-01249', 'Door', 80);

-- T_Customer
INSERT INTO T_Customer
VALUES ('cus01', 'Abel', 'Moremi');

INSERT INTO T_Customer
VALUES ('cus02', 'Olivia', 'Mokwena');

INSERT INTO T_Customer
VALUES ('cus03', 'Olivia', 'Mokwena');

INSERT INTO T_Customer
VALUES ('cus04', 'Ian', 'Seretse');

-- T_Machine
INSERT INTO T_Machine
VALUES ('mc-01');

INSERT INTO T_Machine
VALUES ('mc-02');

INSERT INTO T_Machine
VALUES ('mc-03');

INSERT INTO T_Machine
VALUES ('mc-04');

INSERT INTO T_Machine
VALUES ('mc-05');

INSERT INTO T_Machine
VALUES ('mc-06');

-- T_Employee
INSERT INTO T_Employee
VALUES ('Eno-01', 'Lebo Kgosi', 'line Manager', 4000);

INSERT INTO T_Employee
VALUES ('Eno-02', 'Lame Mosidi', 'Supervisor', 6000);

INSERT INTO T_Employee
VALUES ('Eno-03', 'Donald Motshabi', 'Line Worker', 3000);

INSERT INTO T_Employee
VALUES ('Eno-04', 'Bereka Mosadi', 'Factory Supervisor', 10000);

-- T_Product





DROP TABLE T_MadeBy;
-- DROP FUNCTION fn_operatorNumberOfParts;
DROP TABLE T_Operator;
DROP TABLE T_Supervisor;
DROP TABLE T_MadeOn;
DROP TABLE T_Orders;
DROP TABLE T_Assembles;
DROP TABLE T_Product;
DROP TABLE T_Employee;
DROP TABLE T_Machine;
DROP TABLE T_Customer;
DROP TABLE T_Part;
DROP TABLE T_WMC;


