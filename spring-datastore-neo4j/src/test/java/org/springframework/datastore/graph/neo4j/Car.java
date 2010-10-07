package org.springframework.datastore.graph.neo4j;

import org.neo4j.graphdb.Node;
import org.springframework.datastore.graph.api.GraphEntity;

@GraphEntity
public abstract class Car {
	public Car() {
	}

	public Car(Node n) {
		setUnderlyingState(n);
	}
}