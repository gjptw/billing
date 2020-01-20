package com.company.billing;

import com.couchbase.client.java.Bucket;
import com.couchbase.client.java.Cluster;
import com.couchbase.client.java.CouchbaseCluster;
import com.couchbase.client.java.document.JsonDocument;
import com.couchbase.client.java.document.json.JsonObject;
import com.couchbase.client.java.env.CouchbaseEnvironment;
import com.couchbase.client.java.env.DefaultCouchbaseEnvironment;
import org.apache.qpid.server.BrokerOptions;
import org.apache.qpid.server.model.Broker;

public class CouchbaseProject {

    public static void main(String[] args) {

        CouchbaseEnvironment env = DefaultCouchbaseEnvironment.builder()
                .connectTimeout(10000)
                .kvTimeout(3000)
                .build();
        Cluster cluster = CouchbaseCluster.create(env, "couchbase://127.0.0.1");

        cluster.authenticate("Administrator", "developer");

        Bucket bucket = cluster.openBucket("first");

        JsonObject user = JsonObject.empty()
                .put("firstname", "Walter")
                .put("lastname", "White")
                .put("job", "chemistry teacher")
                .put("age", 50);

       // JsonDocument doc = JsonDocument.create("walter", user);
       // JsonDocument response = bucket.upsert(doc);

        System.out.println("+++");
        System.out.println(bucket.get("walter").content());

        cluster.disconnect();

        startEmbeddedBroker();
    }

        public static void startEmbeddedBroker() {
            Broker broker = new Broker();
            BrokerOptions brokerOptions = new BrokerOptions();
            brokerOptions.setConfigProperty("qpid.amqp_port", environment.getProperty("spring.rabbitmq.port"));
            brokerOptions.setConfigProperty("qpid.broker.defaultPreferenceStoreAttributes", "{\"type\": \"Noop\"}");
            brokerOptions.setConfigProperty("qpid.vhost", environment.getProperty("spring.rabbitmq.virtual-host"));
            brokerOptions.setConfigurationStoreType("Memory");
            brokerOptions.setStartupLoggedToSystemOut(false);
            broker.startup(brokerOptions);
    }

}
