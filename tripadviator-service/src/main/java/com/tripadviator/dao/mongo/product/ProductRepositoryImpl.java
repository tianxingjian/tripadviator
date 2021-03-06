package com.tripadviator.dao.mongo.product;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.stereotype.Repository;

import com.tripadviator.domain.AbstractProduct;
import com.tripadviator.domain.Product;
import com.tripadviator.domain.ProductDetail;

@Repository("productRepository")
public class ProductRepositoryImpl implements ProductRepository
{
	@Autowired
	private MongoTemplate mongoTemplate;

	
	public List<Product> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

	
	public List<Product> findAll(Sort arg0) {
		// TODO Auto-generated method stub
		return null;
	}

	
	public <S extends Product> List<S> save(Iterable<S> arg0) {
		// TODO Auto-generated method stub
		return null;
	}

	
	public Page<Product> findAll(Pageable arg0) {
		// TODO Auto-generated method stub
		return null;
	}

	
	public long count() {
		// TODO Auto-generated method stub
		return 0;
	}

	
	public void delete(String arg0) {
		// TODO Auto-generated method stub
		
	}

	
	public void delete(Product arg0) {
		// TODO Auto-generated method stub
		
	}

	
	public void delete(Iterable<? extends Product> arg0) {
		// TODO Auto-generated method stub
		
	}

	
	public void deleteAll() {
		// TODO Auto-generated method stub
		
	}

	
	public boolean exists(String arg0) {
		// TODO Auto-generated method stub
		return false;
	}

	
	public Iterable<Product> findAll(Iterable<String> arg0) {
		// TODO Auto-generated method stub
		return null;
	}

	
	public Product findOne(String arg0) {
		// TODO Auto-generated method stub
		return null;
	}

	
	public <S extends AbstractProduct> S save(S s) 
	{
		mongoTemplate.save(s);
		return null;
	}
	
	/**
	 * Get product by its code
	 *  
	 * @param code
	 * @return
	 */
	@Override
	public ProductDetail getProductByCode(String code)
	{
		Query query = new Query();
		query.addCriteria(Criteria.where("code").is(code));
		
		return mongoTemplate.findOne(query, ProductDetail.class);
	}

	/**
	 * Get all of the product code from DB
	 * 
	 * @return
	 */
	@Override
	public List<String> getAllProductCode()
	{
		Query query = new Query();
		query.fields().include("code");
		
		List<Product> productList = mongoTemplate.find(query, Product.class);
		List<String> productCodeList = new ArrayList<String>();
		
		for (Product product : productList) 
		{
			productCodeList.add(product.getCode());
		}
		
		return productCodeList;
	}
}
