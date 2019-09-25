package com.kodilla.hibernate.invoice.dao;

import com.kodilla.hibernate.invoice.Invoice;
import com.kodilla.hibernate.invoice.Item;
import com.kodilla.hibernate.invoice.Product;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.math.BigDecimal;


@RunWith(SpringRunner.class)
@SpringBootTest
public class InvoiceDaoTestSuite {

    @Autowired
    InvoiceDao invoiceDao;

    @Autowired
    ProductDao productDao;

    @Test
    public void testInvoiceDaoSave() {
        //Given

        Product product1 = new Product("Potatoes");
        Product product2 = new Product("Tomatoes");
        Product product3 = new Product("Garlic");
        Item item1 = new Item(product1,new BigDecimal(10),2,new BigDecimal(20));
        Item item2 = new Item(product2,new BigDecimal(20),4,new BigDecimal(80));
        Item item3 = new Item(product3,new BigDecimal(100),2,new BigDecimal(200));
        item1.setProduct(product1);
        item2.setProduct(product2);
        item3.setProduct(product3);
        productDao.save(product1);
        productDao.save(product2);
        productDao.save(product3);

        Invoice invoice = new Invoice("123456");
        invoice.getItems().add(item1);
        invoice.getItems().add(item2);
        invoice.getItems().add(item3);
        item1.setInvoice(invoice);
        item2.setInvoice(invoice);
        item3.setInvoice(invoice);

        //When
        invoiceDao.save(invoice);
        int id = invoice.getId();

        //Then
        Assert.assertNotEquals(0,id);

        //Clean up

        invoiceDao.deleteById(id);
    }
}
