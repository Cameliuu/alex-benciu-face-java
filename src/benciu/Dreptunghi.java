package benciu;

public class Dreptunghi {
    private int _latime;
    private int _lungime;

    public int GetLatime() {
        return this._latime;
    }

    public int GetLungime() {
        return this._lungime;
    }

    public void SetLatime(int l) {
        this._latime = l;
    }

    public void SetLungime(int l) {
        this._lungime = l;
    }

    public Dreptunghi(int latime, int lungime)
    {
        this._latime=latime;
        this._lungime=lungime;
    }
    public int GetPerimetru(){return 2*this._latime+2*this._lungime;}

    public int GetArie(){return this._latime*this._lungime;}

}
