package EjerciciosP2.EjercicioStrategy;

import java.util.List;

public class ListaCelulares {
    private String searchType;
    private int searchFilter;
    private String searchFilterString;
    private List<Celular> celularList;

    public ListaCelulares(String searchType, int searchFilter, String searchFilterString, List<Celular> celularList) {
        this.searchType = searchType;
        this.searchFilter = searchFilter;
        this.searchFilterString = searchFilterString;
        this.celularList = celularList;
    }

    public String getSearchType() {
        return searchType;
    }

    public void setSearchType(String searchType) {
        this.searchType = searchType;
    }

    public int getSearchFilter() {
        return searchFilter;
    }

    public void setSearchFilter(int search_filter) {
        this.searchFilter = search_filter;
    }

    public String getSearchFilterString() {
        return searchFilterString;
    }

    public void setSearchFilterString(String search_filter_string) {
        this.searchFilterString = search_filter_string;
    }

    public List<Celular> getPhoneList() {
        return celularList;
    }

    public void setPhoneList(List<Celular> phone_list) {
        this.celularList = phone_list;
    }
}
