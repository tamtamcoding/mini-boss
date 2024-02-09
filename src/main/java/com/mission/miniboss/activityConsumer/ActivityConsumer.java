package com.mission.miniboss.activityConsumer;

import java.lang.reflect.Type;
import java.util.List;

import com.mission.miniboss.cat.cat;
import jakarta.annotation.PostConstruct;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class ActivityConsumer
{

    @PostConstruct
    public void consumer()
    {
        String url = "https://cat-fact.herokuapp.com/facts";
        RestTemplate template = new RestTemplate();
        ResponseEntity<List<cat>> activities=template.exchange(url, HttpMethod.GET, HttpEntity.EMPTY,
                new ParameterizedTypeReference<List<cat>>()
                {
                    @Override
                    public Type getType()
                    {
                        return super.getType();
                    }
                });
        List<cat> list=activities.getBody();
        System.out.println("Size:"+list.size());
        if(list.size()>0) {
            for(cat st:list) {
                System.out.println("user_id:"+st.getUser()+"type:"+st.getType()+"cat_info:"+st.getText());
            }
        }
    }

}
