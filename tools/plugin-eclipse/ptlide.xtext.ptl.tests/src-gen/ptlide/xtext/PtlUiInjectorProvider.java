/*
* generated by Xtext
*/
package ptlide.xtext;

import org.eclipse.xtext.junit4.IInjectorProvider;

import com.google.inject.Injector;

public class PtlUiInjectorProvider implements IInjectorProvider {
	
	public Injector getInjector() {
		return ptlide.xtext.ui.internal.PtlActivator.getInstance().getInjector("ptlide.xtext.Ptl");
	}
	
}
