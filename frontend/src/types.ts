export type Book = {
    id: number;
    coverURL: string;
    rate: number;
    title: string;
    author: string;
    description: string;
    price: number;
    stock: number;
    category: string;
    releaseDate: string;
    isRelease: boolean;
    isFavorite: boolean;
};

export type User = {
    id: number;
    email: string;
    password: string;
};

export type UserCart = {
    user: User;
    items: Book[];
    total: number;
}