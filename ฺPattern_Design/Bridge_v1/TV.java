package bridge_v1;

 public abstract class TV
 {
   protected Remote remote;

   protected TV(Remote r)
   {
     this.remote = r;
   }
   abstract void on();
   abstract void off();
 }
