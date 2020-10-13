package com.TestTask21Century;

import com.TestTask21Century.entity.Goods;
import com.TestTask21Century.repository.GoodsRepository;
import com.TestTask21Century.service.GoodsServiceImpl;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import java.util.ArrayList;
import java.util.List;
import java.util.logging.Logger;

import static org.mockito.Mockito.when;

class TestTask21CenturyApplicationTests {
	@Mock
	private GoodsRepository goodsRepository;
	@InjectMocks
	private GoodsServiceImpl goodsService;

	private Goods goodsOne = new Goods("Куртка",1500);
	private Goods goodsTwo = new Goods("Сумка",1700);
	private Goods goodsThree = new Goods("Штаны",1900);

	@BeforeEach
	public void init() throws Exception {
		MockitoAnnotations.initMocks(this);
	}

	@Test
	void findAll() {
		List<Goods> list = new ArrayList<>();
		list.add(goodsOne);
		list.add(goodsTwo);
		list.add(goodsThree);
        Logger log = Logger.getLogger(TestTask21CenturyApplicationTests.class.getName());
		log.info("работаю");
		when(goodsRepository.findAll()).thenReturn(list);
	}
}
