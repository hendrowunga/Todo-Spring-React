import http from "../http-common";

class TutorialDataService {
  getAll() {
    return http.get("/todo");
  }

  get(id) {
    return http.get(`/todo/${id}`);
  }

  create(data) {
    return http.post("/todo", data);
  }

  update(id, data) {
    return http.put(`/todo/${id}`, data);
  }

  delete(id) {
    return http.delete(`/todo/${id}`);
  }

  deleteAll() {
    return http.delete(`/todo`);
  }

  findByTitle(title) {
    return http.get(`/todo?title=${title}`);
  }
}

// Tetapkan instance ke variabel
const todoDataService = new TutorialDataService();

// Ekspor variabel yang sudah diberi nama
export default todoDataService;
