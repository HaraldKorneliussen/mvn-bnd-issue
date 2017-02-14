
A minimized example for a bug report.

To reproduce, check out and run "mvn install" with a recent maven (I've used 3.3.9). It should report a java.lang.StringIndexOutOfBoundsException instead of the list of missing dependencies.

This example is heavily based on the bnd maven tutorial at http://enroute.osgi.org/tutorial_eval/480-testing

