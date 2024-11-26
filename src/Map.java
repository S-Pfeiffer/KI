public class Map {

    private Tile[][] map = new Tile[Globals.MAP_SIZE][Globals.MAP_SIZE];

    public Map() {
        initMap(Globals.MAP_SIZE);
    }

    private void initMap(int size) {
        for (int x = 0; x < size; x++) {
            for (int y = 0; y < size; y++) {
                this.map[x][y] = new Tile(Globals.TILE_TYPE_WATER);
            }
        }
    }

    public int getTileType(int x, int y) {
        return map[x][y].getType();
    }

    public double getTileFood(int x, int y) {
        return map[x][y].getFoodValue();
    }

    public void setTileType(int x, int y, int type) {
        map[x][y].setType(type);
    }

}