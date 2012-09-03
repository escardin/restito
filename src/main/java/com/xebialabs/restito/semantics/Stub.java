package com.xebialabs.restito.semantics;

import com.google.common.base.Function;
import com.google.common.base.Functions;
import com.google.common.base.Predicate;
import com.google.common.base.Predicates;
import org.glassfish.grizzly.http.server.Request;
import org.glassfish.grizzly.http.server.Response;

/**
 * When request matches XXX => do YYY
 */
public class Stub {

	public Predicate<Call> when = Predicates.alwaysTrue();

	public Function<Response, Response> what = Functions.identity();

	public Stub() {}

	public Stub(Predicate<Call> when, Function<Response, Response> what) {
		this.when = when;
		this.what = what;
	}

	public Predicate<Call> getWhen() {
		return when;
	}

	public Function<Response, Response> getWhat() {
		return what;
	}

	public void setWhen(Predicate<Call> when) {
		this.when = when;
	}

	public void setWhat(Function<Response, Response> what) {
		this.what = what;
	}
}
