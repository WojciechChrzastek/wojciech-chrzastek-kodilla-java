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
import java.util.Arrays;

@RunWith(SpringRunner.class)
@SpringBootTest
public class InvoiceDaoTestSuite {
    @Autowired
    ProductDao productDao;
    @Autowired
    ItemDao itemDao;
    @Autowired
    InvoiceDao invoiceDao;

    @Test
    public void testInvoiceDaoSave() {
        //Given
        Product product1 = new Product("product1");
        Product product2 = new Product("product2");

        Item item1 = new Item(product1, new BigDecimal(100), 1, new BigDecimal(100));
        Item item2 = new Item(product2, new BigDecimal(200), 2, new BigDecimal(400));

        Invoice invoice1 = new Invoice("001", Arrays.asList(item1, item2));

        //When
        productDao.save(product1);
        productDao.save(product2);
        invoiceDao.save(invoice1);

        //Then
        Assert.assertNotEquals(0, product1.getId());
        Assert.assertNotEquals(0, product2.getId());
        Assert.assertNotEquals(0, invoice1.getId());

        //CleanUp
        invoiceDao.delete(invoice1);
        itemDao.delete(item1);
        itemDao.delete(item2);
        //productDao.delete(product1);
        //productDao.delete(product2);
    }
}