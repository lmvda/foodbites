package md5cf360e7259ad6bf2423d7f6727e55605;


public class PerfilActivity
	extends android.app.Activity
	implements
		mono.android.IGCUserPeer
{
/** @hide */
	public static final String __md_methods;
	static {
		__md_methods = 
			"n_onCreate:(Landroid/os/Bundle;)V:GetOnCreate_Landroid_os_Bundle_Handler\n" +
			"";
		mono.android.Runtime.register ("FoodbitesAPP.PerfilActivity, FoodbitesAPP, Version=1.0.0.0, Culture=neutral, PublicKeyToken=null", PerfilActivity.class, __md_methods);
	}


	public PerfilActivity () throws java.lang.Throwable
	{
		super ();
		if (getClass () == PerfilActivity.class)
			mono.android.TypeManager.Activate ("FoodbitesAPP.PerfilActivity, FoodbitesAPP, Version=1.0.0.0, Culture=neutral, PublicKeyToken=null", "", this, new java.lang.Object[] {  });
	}


	public void onCreate (android.os.Bundle p0)
	{
		n_onCreate (p0);
	}

	private native void n_onCreate (android.os.Bundle p0);

	private java.util.ArrayList refList;
	public void monodroidAddReference (java.lang.Object obj)
	{
		if (refList == null)
			refList = new java.util.ArrayList ();
		refList.add (obj);
	}

	public void monodroidClearReferences ()
	{
		if (refList != null)
			refList.clear ();
	}
}