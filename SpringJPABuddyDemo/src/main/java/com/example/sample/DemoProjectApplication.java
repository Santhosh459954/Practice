package com.example.sample;

import com.example.sample.model.Customer;
import com.example.sample.model.Product;
import com.example.sample.repository.CustomerRepository;
import com.example.sample.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import java.util.ArrayList;
import java.util.List;

//@SpringBootApplication(scanBasePackages={"com.example.*"})
//@EnableJpaRepositories
@SpringBootApplication
public class DemoProjectApplication implements CommandLineRunner {
	@Autowired
	CustomerRepository customerRepository;
	@Autowired
	ProductRepository productRepository;

	public static void main(String[] args) {
		SpringApplication.run(DemoProjectApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		Customer customer = new Customer();
		customer.setId(2L);
		customer.setFirstName("Santhosh123");
		customer.setLastName("K");
		customer.setAge(33);

		Product product = new Product();
		product.setId(2L);
		product.setName("TV");
		product.setQuantity("12");
		product.setPrice(12000);
		productRepository.save(product);
		List<Product> list = new ArrayList<>();
		list.add(product);
		customer.setProducts(list);
		customerRepository.save(customer);

	}
}
