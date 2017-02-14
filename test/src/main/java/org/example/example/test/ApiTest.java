package org.example.example.test;

import org.example.example.api.ExampleService;
import junit.framework.TestCase;
import org.osgi.framework.BundleContext;
import org.osgi.framework.FrameworkUtil;
import org.osgi.framework.ServiceReference;

public class ApiTest extends TestCase {
    BundleContext context = FrameworkUtil.getBundle(ApiTest.class).getBundleContext();
    
    public void testCall() {
        ServiceReference<ExampleService> service = context.getServiceReference(ExampleService.class);
        assertNotNull("Couldn't get service", service);
    }
}