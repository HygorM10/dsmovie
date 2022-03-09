import MovieCard from "components/MovieCard";
import Pagination from "components/Pagination";
import './styles.css';

function Listing() {
    return (
        <>
            <Pagination />
            <MovieCard />
        </>
    );
}

export default Listing;