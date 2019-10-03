package br.senac.es.trabalhoHelpDesk.API;

public interface OnEventListener<T> {
    public void onSuccess(T object);
    public void onFailure(Exception e);
}
