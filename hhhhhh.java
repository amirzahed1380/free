package android.support.v4.graphics.drawable;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff.Mode;
import android.support.annotation.ColorInt;
import android.support.annotation.RestrictTo;

@RestrictTo({android.support.annotation.RestrictTo.Scope.LIBRARY_GROUP})
public abstract interface TintAwareDrawable
{
  public abstract void setTint(@ColorInt int paramInt);

  public abstract void setTintList(ColorStateList paramColorStateList);

  public abstract void setTintMode(PorterDuff.Mode paramMode);
}

/* Location:           C:\apktool\dex2jar\tunsafe_dex2jar.jar
 * Qualified Name:     android.support.v4.graphics.drawable.TintAwareDrawable
 * JD-Core Version:    0.6.2
 */